def pass_control_condition
  puts "Inside the method"
  if block_given?
    yield
  end
  puts "I'm back"
end


pass_control_condition
puts
pass_control_condition { puts "Inside the block here"}