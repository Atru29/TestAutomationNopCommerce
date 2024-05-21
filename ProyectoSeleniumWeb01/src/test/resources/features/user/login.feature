Feature: Iniciio de Sesion en la web NopCommerce
  Como usuario
  Quiero iniciar sesión en mi cuenta
  Para acceder a las funciones protegidas

  @LogInConCredencialesValidas
  Scenario Outline: Iniciar sesion con credenciales validas
    Given el usuario se encuentra en la pagina principal "https://demo.nopcommerce.com/"
    And el usuario hace clic en Log In
    When el usuario ingresa su direccion de correo electrinico "<email>"
    And el usuario ingresa su password "<password>"
    And el usuario hace clic en Remenber Me
    And el usuario hace clic en el boton Log In
    Then valida se que ecuentra en la pagina principal "<mensajePaginaPrincipal>"
    And valida la opcion My Account "<mensajeMyAccount>"
    Examples:
      | email            | password | mensajePaginaPrincipal | mensajeMyAccount |
      | rojas12@mail.com | 123456   | Welcome to our store   | My account       |