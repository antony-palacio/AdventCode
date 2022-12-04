class FancyInfoProvider: BasicInfoProvider() {

    public override val sessionIdPrefix: String
        get() = "Fancy Session"

    override val providerInfo: String
        get() = "Get fancy info provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy info")
    }
}