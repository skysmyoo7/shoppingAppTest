package screen

import LINE_DIVIDER
import data.CartsItems

class ShoppingCart : Screen() {
    private val products = CartsItems.products

    fun showCartItems() {
        ScreenStack.push(this)
        if (products.isNotEmpty()) {
            println(
                products.keys.joinToString(
                    separator = ", \n ",
                    prefix = """
                        $LINE_DIVIDER
                        장바구니에 담은 상품목록입니다.
                        $LINE_DIVIDER
                        
                    """.trimIndent()
                ) { product ->
                    "카테고리 : ${product.categoryLabel} / 상품명 : ${product.name} / 수량 : ${products[product]}"
                }
            )
        } else {
            println("""
                장바구니에 담긴 상품이 없습니다.
            """.trimIndent())
        }

    }

}
