Feature: Cotizador de autos

  @ExampleTag
  Scenario: Cotizar un auto online
    Given el usuario esta en la pantalla principal del cotizador
    When el usuario selecciona la marca del auto
    And el usuario selecciona chevrolet
    And el usuario selecciona el "2023"
    And el usuario selecciona modelo "CRUZE 1.4 4 PTAS LT AT"
    And el usuario selecciona la provincia "MENDOZA"
    And el usuario selecciona la localidad "25 DE MAYO"
    And el usuario clickea en el boton CONTINUAR
    And el usuario completa el nombre "Danilo" y el apellido "Vezzoni"
    And el usuario completa con el mail "info@gmail.com"
    And el usuario completa el codigo de area "261" y el telefono "5999999"
    And el usuario completa la edad "18 años"
    And el usuario clickea en el boton CONTINUAR
    And el usuario selecciona las opciones de su auto
    And el usuario clickea en el boton COTIZAR
    And el usuario clickea el boton CONTRATAR
    Then el usuario contrata el seguro
