package screen

class ShoppingHome {

    fun start(){
        showWelcomeMessage()
        showCategories()
    }

    private fun showWelcomeMessage() {
        println("이름을 입력해주세요.")
        val userName = readLine()
        println("$userName 님 환영합니다.")
        println("목록을 선택해주세요.")
    }

    private fun showCategories() {
        val category = arrayListOf<String>("전자기기", "패션", "반려동물물품")
        for (i in category) {
            println(i)
        }
        println("=> 장바구니로 이동하려면 #을 눌러주세요.")

        var selectCategory = readLine()
        while (selectCategory.isNullOrBlank() && selectCategory !in category) {
            println("다시 입력해주세요.")
            selectCategory = readLine()
        }
        if (selectCategory == "#") {
            println("장바구니로 이동합니다.")
        } else {

        }
    }



}