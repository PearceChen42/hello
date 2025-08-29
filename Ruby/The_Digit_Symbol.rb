voicemail = 'I can be reached at 555-123-4567 or regexman@gmail.com'

p voicemail.scan /\d/

p voicemail.scan /\d+/

p voicemail.scan (/\d{3}/)

p voicemail.scan (/\d{3,}/)

p voicemail.scan (/\d{1,4}/)
