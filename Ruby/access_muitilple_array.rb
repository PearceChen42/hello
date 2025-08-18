tv_channels = ["CBS","UPN","CW","FOX","NBC","ESPN"]

p tv_channels.values_at(1)
p tv_channels.values_at(0,4)
p tv_channels.values_at(1,0,2)

p tv_channels.values_at(1,1,-1,3)

puts 


p tv_channels.values_at(0,1,10)