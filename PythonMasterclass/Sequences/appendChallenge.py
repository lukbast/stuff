data = [
    "Andromeda - Shrub",
    "Bellflower - Flower",
    "China Pink - Flower",
    "Daffodil - Flower",
    "Evening Primrose - Flower",
    "French Marigold - Flower",
    "Hydrangea - Shrub",
    "Iris - Flower",
    "Japanese Camellia - Shrub",
    "Lavender - Shrub",
    "Lilac - Shrub",
    "Magnolia - Shrub",
    "Peony - Shrub",
    "Queen Anne's Lace - Flower",
    "Red Hot Poker - Flower",
    "Snapdragon - Flower",
    "Sunflower - Flower",
    "Tiger Lily - Flower",
    "Witch Hazel - Shrub",
]

flowers = []
shrubs = []


for i, item in enumerate(data):
    if "Flower" in item:
        flowers.append(data[i])
    else:
        shrubs.append(data[i])


print(flowers)
print(shrubs)

# flowers2 = [*flowers]
# b =[*a] best performing method of shallow copying lists
# print(flowers == flowers2)
# print(flowers is flowers2)
