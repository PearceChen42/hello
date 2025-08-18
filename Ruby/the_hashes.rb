empty_hash= { }

puts empty_hash
puts empty_hash.class

empty_array = []
p empty_array.class

puts empty_hash.length
puts empty_hash.empty?

nfl_roster_salaries = { 
    "Patrick Mahomes" => 50_000_000,
    "Josh Alien" => 25_000_000,
    "Joe Burrow" => 12_000_000
 }
p nfl_roster_salaries

nfl_roster = {
    "Kansas City Chiefs" => ["Partick Mahomes","Travis Kelce"],
    "Los Angles Rams" => ["Matthew Stafford","Aaron Donald","Cooper Kupp"]

}
p nfl_roster

p nfl_roster_salaries["Patrick Mahomes"]
p nfl_roster_salaries["asdasd"]
p nfl_roster["Los Angles Rams"]
puts

p nfl_roster_salaries.fetch("Josh Alien",0)
p nfl_roster_salaries.fetch("Josh Nonsense",0)