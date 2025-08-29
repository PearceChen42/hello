poem = "99 bottles of beer on the wall..., 99 bottles of beer..."

p poem.scan(/\A\d+/)

p poem.scan(/\.+\z/)