Feature: Add Category
  As a user of phptravels
  i want to use the webpage phptravels to
  add a Post

  @AddPost
  Scenario Outline: Add Post
    Given he should logged in phptravels
    When he create a new post
      | posttitle   | permalink   | body   | keywords   | description   | related   |
      | <posttitle> | <permalink> | <body> | <keywords> | <description> | <related> |
    And he search the post
      | posttitle   |
      | <posttitle> |
    Then he will see that the post was created
    Examples:
      | posttitle | permalink | body | keywords | description | related |
      | Escritura | permalink | body | keywords | description | related |