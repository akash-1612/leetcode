class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        l = []
        for index, i in enumerate(words):
            if x in i:
                l.append(index)
        return l

        