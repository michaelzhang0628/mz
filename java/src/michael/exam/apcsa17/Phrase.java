package michael.exam.apcsa17;

public class Phrase {
    private String currentPhrase;

    public Phrase(String p) {
        this.currentPhrase = p;
    }

    public int findNthOccurrence(String str, int n) {
        int startingIndex = 0;
        int indexFound = 0;
        for (int i = 0; i < n; i++) {
            indexFound = currentPhrase.indexOf(str, startingIndex);
            if (indexFound == -1) {
                return -1;
            }
            startingIndex = indexFound + 1;
        }
        return indexFound;
    }

    public void replaceNthOccurrence(String str, int n, String repl) {
        int index = findNthOccurrence(str, n);
        if (index != -1) {
            currentPhrase = currentPhrase.substring(0, index) + repl + currentPhrase.substring(index + str.length());
        }
    }

    public int findLastOccurrence(String str) {
        int n = 1;
        int index = -1;
        int nextIndex = findNthOccurrence(str, n);
        while (nextIndex != -1) {
            index = nextIndex;
            n++;
            nextIndex = findNthOccurrence(str, n);
        }
        return index;
    }

    public String toString() {
        return currentPhrase;
    }
}
