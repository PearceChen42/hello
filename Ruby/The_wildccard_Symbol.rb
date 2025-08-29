voicemail = 'I can be reached at 555-123-4567 or regexman@gmail.com'

p voicemail.scan(/.e./)

p voicemail.scan(/\d{3}.\d{3}.\d{4}/)

p voicemail.scan(/.....\..../)