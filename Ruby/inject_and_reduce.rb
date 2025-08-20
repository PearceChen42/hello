p [10,20,30].reduce(1) { |sum, number| sum + number }

p [10,20,30].inject(100) { |sum, number| sum + number }

color_counts = [ "Red","Blue", "Red" ].reduce({}) do |my_hashs,color|
  if my_hashs[color].nil?
    my_hashs[color] = 1
  else
    my_hashs[color] += 1
  end
  my_hashs
end

p color_counts