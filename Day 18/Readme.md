In this i have solved the reverse string problem from coding ninjas, please excuse my naming conventions, basically the idea was to reverse the string and remove any extra spaces between the string and then also in the end return a string that has no extra spaces in the start or the end of the string.
1. First i removed the extra sapace from the string using theregex and .replaceAll method.
2. I converted the string to an Array so that i can use a loop to reverse the string, I know better approaches are there but this is me solving without even touching anything about algorithms and datastructures.
3. Inside the loop i have appended text with single space so that i get the string with exact 1 space, but the problem is the last word will have an extra space which is a problem. 
4. I solved the last space issue using the .trim method in java which is used to remove extra space from the start and end of the string.

TLDR - I know my solution is all over the place but this is something that came out of my head i have not yet studied DSA.