import pandas
from geopy.geocoders import ArcGIS


arcgis = ArcGIS(timeout=100)

df1 = pandas.read_csv('supermarkets.csv')

addresses = []
for i in range(0, df1.shape[0]):
    addresses.append(', '.join(df1.loc[i, 'Address': 'State']))


lats = []
longs = []
for entry in addresses:
    result = ArcGIS.geocode(arcgis, entry)
    lats.append(result.latitude)
    longs.append(result.longitude)

df1['latitude'] = lats
df1['longitude'] = longs

print(df1)
