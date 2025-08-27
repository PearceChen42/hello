require "set"

p seasons = Set.new([ "Fall", "Winter" ,"Spring","Winter","Fall" ])
p seasons.include? "Winter"

seasons.each { |item| puts " #{item}"}