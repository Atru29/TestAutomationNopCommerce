Feature: Operaciones en la web NopCommerce
  Como usuario
  Quiero realizar diversas operaciones en mi cuenta
  Para aprovechar las funciones disponibles en la plataforma

  @AgregarProductoAlCarrito
  Scenario Outline: Comprar un producto después de iniciar sesión
    Given el usuario se encuentra en la pagina principal "https://demo.nopcommerce.com/"
    And el usuario hace clic en Log In
    When el usuario ingresa su direccion de correo electronico "<email>"
    And el usuario ingresa su password "<password>"
    And el usuario hace clic en Remenber Me
    And el usuario hace clic en el boton Log In
    Then valida se que ecuentra en la pagina principal "<mensajePaginaPrincipal>"
    And valida la opcion My Account "<mensajeMyAccount>"

    When el usuario hace clic en el boton Computers
    And el usuario hace clic en Desktops
    And el usuario ordena por precio mas bajo "<filtroBusqueda>"
    And el usuario selecciona la cantidad de productos en el catalago "<cantidadBusqueda>"
    And el usuario hace clic en agregar al carrito
    Then se valida el mensaje de confirmacion del producto argegado al carrito "<mensajeAddCarrito>"
    And el usuario hace clic en Shopping Cart
    And se valida que el producto se encuentre en el carrito

    Examples:
      | email            | password | mensajePaginaPrincipal | mensajeMyAccount | filtroBusqueda     | cantidadBusqueda | mensajeAddCarrito                  |
      | jrojas1@mail.com | 123456   | Welcome to our store   | My account       | Price: Low to High | 9                | The product has been added to your |

