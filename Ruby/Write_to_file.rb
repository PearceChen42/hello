File.open("novel.txt","w") {
  |file|  file.puts "I'm creating this file using Ruby"
  file.write "No line  break here!"
  file.puts "pettry cool!"
}

