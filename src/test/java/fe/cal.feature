Feature: BMI CAL

  Scenario Outline: Calculate different data
    Given I am in BMI calculator page
    When i enter  age <age>in BMI cal page
    And i enter  gender <gender> in BMI cal page
    When i enter height  <height> in BMI page
    And i enter weight <weight> in BMI page
   And  i chk result <expected result>
    Then  i press cal button
    And Close the browser
    Examples:
      | age   | gender     | height  | weight|expected result|
      | "20"  | "Male"     | "180"   | "60" |"18.5"         |
      |" 35   |"female     |"160"    |"55"   |"21.5"        |
      |"50"   |"male"      |"175"    |"65"   |"21.2 "       |
      |"45"   |"female"    |"150"    |"52"  |"23.1 "        |
