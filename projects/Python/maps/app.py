import folium
import pandas

data = pandas.read_csv('Volcanoes.txt')
my_map = folium.Map(location=[38.9698982, -122.7710037], zoom_start=5)
fg_volcanoes = folium.FeatureGroup(name='Volcanoes')
fg_pop = folium.FeatureGroup(name="Population")
fg_pop.add_child(folium.GeoJson(data=(open('world.json', 'r', encoding='utf-8-sig').read()),
                                style_function=lambda x:
                                {'fillColor': 'green' if x['properties']['POP2005'] < 10000000 else 'orange' if
                                10000000 <= x['properties']['POP2005'] < 20000000 else 'red'}))

for i in range(0, data.shape[0]):
    type_ = data.loc[i, 'TYPE']
    status = data.loc[i, 'STATUS'].strip('?')
    name = data.loc[i, 'NAME']
    elev = data.loc[i, 'ELEV']
    longs = data.loc[i, 'LON']
    lats = data.loc[i, 'LAT']
    if elev <= 1350:
        color = 'green'
    elif elev <= 2700:
        color = 'orange'
    else:
        color = 'red'

    fg_volcanoes.add_child(folium.CircleMarker(location=(lats, longs), popup="""
    <h5>Name: <b>{}</b></h5>
    <p>type: {}</p>
    <p>status: {}</p>
    <p>elevation: {}</p>
    <a href="https://www.google.pl/search?q=volcano+{}" >More info</a>
    """.format(name, type_, status, elev, name), fill_color=color, color=color, opacity=0.3))

my_map.add_child(fg_volcanoes)
my_map.add_child(fg_pop)


my_map.add_child(folium.LayerControl())
my_map.save('Map1.html')
