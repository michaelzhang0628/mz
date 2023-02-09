def owl_count(text):
    period_list = text.split(".")
    count = 0
    for item in period_list:
        question_mark_list = item.split("?")
        for smaller_item in question_mark_list:
            if "owl" in smaller_item.lower():
                count += 1
    return count


words = "I really like owls. Did you know that an owl's eyes are more than twice as big as the eyes of other birds of comparable weight? And that when an owl partially closes its eyes during the day, it is just blocking out light? Sometimes I wish I could be an Owl."
print("The number of times the word owls was said was " + str(owl_count(words)))
