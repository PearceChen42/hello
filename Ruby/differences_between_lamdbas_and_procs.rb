my_proc = Proc.new { |name, age| puts"Your name is #{name} and you are #{age} years old" }
my_lambda = lambda { |name, age| puts "Your name is #{name} and your are #{age} years old" }

def do_stuff(&code)
    code.call("Boris", 25)
end
do_stuff(&my_proc)
do_stuff(&my_lambda)
puts
def do_more_stuff(&code)
    code.call("Boris")
end
do_more_stuff(&my_proc)
# do_more_stuff(&my_lambda)
# 
my_proc = Proc.new { return "PROC RETURN" }
my_lambda = lambda { return "LAMBDA RETURN" }
puts
def excute(&logic)
  puts "Staring execution.."
    puts logic.call
  puts "Ending execution..."
end

excute(&my_lambda)
puts
excute(&my_proc)
