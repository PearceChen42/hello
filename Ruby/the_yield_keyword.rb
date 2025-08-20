def pass_control
  puts "I'm at the sttart of the pass_control method"
  yield
  puts "I'm back inside the method "
end

pass_control { p "Now I'm inside the block" }

puts
pass_control do 
  puts "Hello, line number 1"
  puts "Goodbye, line number 2"
end
