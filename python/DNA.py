def DNA(sequence):
    CG_sum = 0
    for ch in sequence:
        if ch == 'C':
            CG_sum += 1
        elif ch == 'G':
            CG_sum += 1
    return CG_sum/len(sequence)

print(DNA("AG0C293GGACVbnaoqB0182"))
print(DNA("hjakCCwCHASGJBkqpGBGHjGlwo"))
print(DNA("iBVvbBiOasb1n2CCC8HAB90G1GB39C2Hnskx"))