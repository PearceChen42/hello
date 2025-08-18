def authenticate_agent(agemt_number,name,job_title)
    if (agemt_number == "007" && name== "James Bond") || job_title == "Secret Agent"
        puts "Access granted,please proceed to Intelligence department!"
    else
        puts "Access denied, #{name}!"
    end  

end


authenticate_agent("007","James Bond","Secret Agent")
authenticate_agent("007","","Secret Agent")
authenticate_agent("007","","")
