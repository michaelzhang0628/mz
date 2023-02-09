def owl_count(text):
    count = 0
    period_list = text.split(".")
    for item in period_list:
        question_mark_list = item.split("?")
        for small_item in question_mark_list:
            space_list = small_item.split(" ")
            for tiny_item in space_list:
                if "owl" in tiny_item.lower():
                    count += 1
    return count
