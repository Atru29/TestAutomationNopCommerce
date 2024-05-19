Feature: Registro de Cuenta en la web NopCommerce
  Como usuario
  Quiero registrar mi cuenta
  Para acceder a las funciones del sistema NopCommerce

  Scenario Outline: Registro con credenciales validas
    Given el usuario se encuentra en la pagina principal "https://demo.nopcommerce.com/"
    And el usuario hace clic en Register
    When el usuario selecciona su genero
    And el ususario ingresa su nombre "<nombre>"
    And el usuario ingresa su apellido "<apellido>"
    And el usuario ingresa su fecha de nacimiento
    And el uusario ingresa su direccion de correo electronico "<email>"
    And el usuario ingresa el nombre de su compañia
    And el usuario ingresa una contrasena
    And el usuario confirma su contrasena
    And el usuario hace clic en Register
    Then se valida el mensaje de confirmacion "<mensajeRegistro>"
    And el usuario es redirigio a la pagina principal
    And valida se que ecuentra en la pagina principal "<mensajePaginaPrincipal>"
    And valida la opcion My Account "<mensajeMyAccount>"
    Examples:
      | nombre      | apellido     | email         | mensajeRegistro             | mensajePaginaPrincipal | mensajeMyAccount |
      | Juan Arturo | Rojas Olarte | juan@mail.com | Your registration completed |                        | My account       |