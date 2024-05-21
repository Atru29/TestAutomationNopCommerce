Feature: Navegacion a la Pagina Principal

  Como usuario
  Quiero acceder a las opciones de Registro e Inicio de Sesión desde la página principal
  Para poder crear una nueva cuenta o iniciar sesión en mi cuenta existente

  @NavegarALogin
  Scenario Outline: El usuario navega a la página de Inicio de Sesión desde la página principal
    Given el usuario se encuentra en la pagina principal "https://demo.nopcommerce.com/"
    When el usuario hace clic en Log In
    Then valida que se encuentre en el Log In "<mensajeLogIn>"

    Examples:
      | mensajeLogIn             |
      | Welcome, Please Sign In! |

  @NavegarARegister
  Scenario Outline: Pagina Principal
    Given el usuario se encuentra en la pagina principal "https://demo.nopcommerce.com/"
    When el usuario hace clic en Log In
    Then valida que se encuentre en el Register "<mensajeRegister>"
    And valida qe este en la seccion Tus datos personales "<mensajePersonalDetails>"

    Examples:
      | mensajeRegister | mensajePersonalDetails |
      | Register        | Your Personal Details  |