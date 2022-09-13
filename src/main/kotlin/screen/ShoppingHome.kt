package screen

import extensions.getNotEmptyString

class ShoppingHome : Screen() {

    fun start(){
        showWelcomeMessage()
        showCategories()
    }

    private fun showWelcomeMessage() {
        ScreenStack.push(this)

        println("이름을 입력해주세요.")
        val userName = readLine().getNotEmptyString()
        println("$userName 님 환영합니다.")
        println("목록을 선택해주세요.")
    }

    private fun showCategories(){
        val shoppingCategory = ShoppingCategory()
        shoppingCategory.showCategories()
    }



}