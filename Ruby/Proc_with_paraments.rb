def talk_about(name, &my_proc)
    puts "Ley me tell you about #{name}"
    my_proc.call(name)
end

def talk_about_2(name)
     puts "Ley me tell you about #{name}"
     yield(name)
end

good_thing = Proc.new { |name| puts " #{name} is a jolly good fellow "}

bad_thing = Proc.new { |name| puts "#{name} is dolt!"}

talk_about("Boris",&good_thing)
talk_about("Boris",&bad_thing)
puts
talk_about_2("Dan") { |name| puts "He is  idolt! #{name}" }
talk_about_2("Dan", &good_thing)