Feature: Add Category
  As a user of phptravels
  i want to use the webpage phptravels to
  add a categories

  @AddCategory
  Scenario Outline: Add Category
    Given he should logged in phptravels
    When he create a new category
      | categoryName   | vietnamese   | russian   | arabic   | farsi   | turkish   | french   | spanish   | german   |
      | <categoryName> | <vietnamese> | <russian> | <arabic> | <farsi> | <turkish> | <french> | <spanish> | <german> |
    And he search the new category
      | categoryName   |
      | <categoryName> |
    Then he will see that the category was created
    Examples:
      | categoryName | vietnamese | russian | arabic       | farsi | turkish | french     | spanish   | german    |
      | Escritura    | Viết       | Письмо  | جاري الكتابة | نوشتن | yazı    | l'écriture | escritura | Schreiben |