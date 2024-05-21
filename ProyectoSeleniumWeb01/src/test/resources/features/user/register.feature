Feature: Registro de Cuenta en la web NopCommerce
  Como usuario
  Quiero registrar mi cuenta
  Para acceder a las funciones del sistema NopCommerce

  @RegistroConCredencialesValidas
  Scenario Outline: Registro con credenciales validas
    Given el usuario se encuentra en la pagina principal "https://demo.nopcommerce.com/"
    And el usuario hace clic en Register
    When el usuario selecciona su genero
    And el ususario ingresa su nombre "<nombre>"
    And el usuario ingresa su apellido "<apellido>"
    And el usuario ingresa su fecha de nacimiento su dia "<day>" , el mes "<month>" y el anio "<year>"
    And el uusario ingresa su direccion de correo electronico "<email>"
    And el usuario ingresa el nombre de su compania "<nombreCompania>"
    And el usuario ingresa una contrasena "<password>"
    And el usuario confirma su contrasena "<rePassword>"
    And el usuario hace clic en el boton Register
    Then se valida el mensaje de confirmacion "<mensajeRegistro>"
    And el usuario hace clic en continuar
    And valida se que ecuentra en la pagina principal "<mensajePaginaPrincipal>"
    And valida la opcion My Account "<mensajeMyAccount>"
    Examples:
      | nombre      | apellido     | day | month | year | email           | nombreCompania | password | rePassword | mensajeRegistro             | mensajePaginaPrincipal | mensajeMyAccount |
      | Juan Arturo | Rojas Olarte | 1   | July  | 2000 | rojas03@mail.com | AtruCompany    | 123456   | 123456     | Your registration completed | Welcome to our store   | My account       |