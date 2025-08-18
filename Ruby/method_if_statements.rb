def meat_plan(time_of_week,time_of_day)
    if time_of_week == "weekday"
        if time_of_day == "morning"
            "Cereal"
        elsif time_of_day== "night"
            "Chicken nuggets"
        end
    elsif time_of_week == "weekend"
        if time_of_day =="morning"
            "French Toast"
        elsif time_of_day == "night"
                "Steak"
        end
    end
    

end

p meat_plan("weekday","morning")