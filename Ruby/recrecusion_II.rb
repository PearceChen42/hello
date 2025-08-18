
# def reverser(text)
#     first_index = 0
#     last_index = text.length - 1
#     reversed = ""

#     while last_index >= first_index
#         reversed += text[last_index]# w
#         last_index -=1
#     end
#     reversed
# end

def reverse(text)
    if text.length ==1
        return text
    
    else
    last_character = text[-1]
    
    remainder = text[0,text.length - 1]

    return last_character + reverse(remainder)
    end
end

puts reverse("straw")