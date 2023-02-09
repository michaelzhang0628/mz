def owl_count(text):
    period_list = text.split(".")
    count = 0
    for item in period_list:
        question_mark_list = item.split("?")
        for smaller_item in question_mark_list:
            if "owl" in smaller_item.lower():
                count += 1
    return count
