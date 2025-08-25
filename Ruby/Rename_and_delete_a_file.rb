
begin
  if File.exist? "novel.txt"
  File.rename("novel.txt","SomeThingelse.txt")
  # File.rename("SomeThingelse.txt","novel.txt")
  else p "No such file"
  end
puts
rescue  Errno::ENOENT => e
  p e.message
ensure p "Done"
end
puts
begin
File.delete("SomeThingelse.txt")
rescue  Errno::ENOENT => e
  p e.message
ensure p "Done"
end
