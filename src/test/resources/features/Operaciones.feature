Feature: Operaciones en la calculadora del celular

  Scenario Outline: Se realiza suma de dos números
    When Se suma el "<número_1>" con el "<número_2>"
    Then y se verifica que el resultado es el "<número_3>"
    When Se resta el "<número_4>" con el "<número_5>"
    Then y se verifica que el resultado es el "<número_6>"
    When Se multiplica el "<número_2>" con el "<número_5>"
    Then y se verifica que el resultado es el "<número_4>"
    When Se Divide el "<número_4>" con el "<número_5>"
    Then y se verifica que el resultado es el "<número_2>"
    Examples:
      | número_1 | número_2 | número_3 | número_4 | número_5 | número_6 |
      | 1        | 2        | 3        | 8        | 4        | 4        |
