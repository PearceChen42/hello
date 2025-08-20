def speak_the_truth(name)
  yield(name)
end

speak_the_truth("Boris") { | name | puts "#{name} is brilliant! " }
