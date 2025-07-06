import requests

base_url  = 'http://api.weatherapi.com/v1/current.json'
user_api = '0457baab1c524068849200721250607'



def get_weather_info(city):
  params ={
      'key':user_api,
      'q':city,
      'aqi':'yes'
  }

  response = requests.get(base_url,params = params)
  print(response.status_code)
  if response.status_code == 200:
    data = response.json()
    location = data['location']['name']
    region = data['location']['region']
    country = data['location']['country']
    location = data['location']['localtime']
    temp_cel = data['current']['temp_c']
  
    humidity = data['current']['humidity']
    wind_speed = data['current']['wind_kph']

    print(f"Weather in {location}:")
    print(f"Temperature: {temp_cel}°C")
    
    print(f"Humidity: {humidity}%")
    print(f"Wind Speed: {wind_speed} km/h")
    print(f"Location: {location}")
    print(f"Region: {region}")
    print(f"Country: {country}")
    print(f"Local Time: {location}")



  else:
    print("Response error code: Check error",response.status_code)
    data = None # Ensure data is set to None on error


print("Welcome to weather app")

city = input("Enter the city name:")
get_weather_info(city.capitalize())

