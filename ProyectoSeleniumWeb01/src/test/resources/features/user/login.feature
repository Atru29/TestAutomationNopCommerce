Feature: Iniciio de Sesion en la web NopCommerce
  Como usuario
  Quiero iniciar sesión en mi cuenta
  Para acceder a las funciones protegidas
  Scenario Outline: Iniciar sesion con credenciales validas
    Given el usuario se encuentra en la pagina principal "https://demo.nopcommerce.com/"
    And el usuario hace clic en Log In
    When
    Examples: