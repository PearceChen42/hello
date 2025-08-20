market = { garlic: "3 clover", milk: "10 gallons" }
kitchen = { bread: "2 Slices", milk: " 100 gallons" }
p market.merge kitchen
p kitchen.merge market
p market
p kitchen

puts

market.merge! kitchen

p market