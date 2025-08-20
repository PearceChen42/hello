team_members = Hash.new([])

p team_members["Buccaneers"]

team_members["Buccaneers"] << "Tom Brady" << "Mike Evans"

p team_members
p team_members["Buccaneers"]

p team_members["Pariots"]
puts 
puts 

team_members = Hash.new do |hash, key|
  my_array = []
  hash[key] = my_array
  my_array
end

p team_members
p team_members["Buccaneers"]
p team_members
team_members["Buccaneers"] << "Tom Brady" << "Mike Evans"
p team_members