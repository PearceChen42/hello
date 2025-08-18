def append_5(elements)
    elements << 5
end

values = [1,2,3,4]
append_5(values)
p values

def upercase(text)
    text.upcase!
end

name = "Boris"

upercase(name)

p name

def append_null(elements)
    elements = []
end

values = [1,2,3,4]
append_null(values)
p values