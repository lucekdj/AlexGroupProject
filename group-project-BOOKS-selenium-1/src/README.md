__Go to https://demoqa.com/books. From there:__
1. Sort the table with books by the Title ascending and descending (use xpath only)
2. Sort the table with books by the Publisher descending (use xpath only)
3. Print out number of books, where authors first name starts with 'A' (Iterate through list of names from the column. Use css only)
4. Open one book by link and make sure title on the new page is the one you clicked (Don't use Sleep, use explicit wait)
5. Open all books by link and assert that ISBN field is NOT NULL (use hint to scroll down to element)
6. Take first and last book in the column, and print the title of the book whose page count is bigger
7. Print the author if Publisher field is NOT O'Reilly Media. Use XPath axes to go to sibling cell
8. Create method that accept String as argument and passes it to Search field. Assert that list of books contains the string (Sleep can be used here)

__Go to https://demoqa.com/select-menu. From there:__
1. Select Value -> pick 'A root option'
2. Select One -> pick 'Prof.'
3. Old Style Select Menu -> pick 'Voilet'
4. Old Style Select Menu -> change to any other option. Assert that it's not 'Voilet'
5. Multiselect dropdown -> pick 'Red' and 'Black'. Assert that two options are picked only