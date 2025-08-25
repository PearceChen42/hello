begin
  my_novel = File.open("novel.txt")

puts
my_novel.each do |line |
  print line+"\n"  
end
rescue Errno::ENOENT => e
p e.message
else puts
   p "File load success!"
ensure  p " DONE "
end