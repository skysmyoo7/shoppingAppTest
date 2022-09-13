package screen

import extensions.getNotEmptyString

class ShoppingCategory {

    public fun showCategories() {
        val category = arrayListOf<String>("전자기기", "패션", "반려동물물품")
        for (i in category) {
            println(i)
        }
        println("=> 장바구니로 이동하려면 #을 눌러주세요.")

        val selectCategory = readLine().getNotEmptyString()
        if (selectCategory == "#") {
            val shoppingCart = ShoppingCart()
            shoppingCart.showCartItems()
        } else {

            if(category.contains(selectCategory)){
                val shoppingProductList = ShoppingProductList()
                shoppingProductList.showProducts(selectCategory!!)
            }else{
                showErrorMessage(selectCategory)
            }

        }
    }

    private fun showErrorMessage(selectCategory: String?) {
        println("$selectCategory : 존재하지 않는 카테고리 입니다. 다시 입력해주세요. ")
        showCategories()
    }

}