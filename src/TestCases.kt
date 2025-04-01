fun check(name: String, result: Boolean, correct: Boolean) {
    if (result == correct) {
        println("success - $name")
    } else {
        println("failed - $name")
    }
}

fun returnTrueIfAnySegmentIsBig(segment: Int) {
    check(
        name = "Return True If Any Segment Is Big",
        result = isSegmentBig(segment),
        correct = true
    )
}

fun returnTrueIfAnySegmentIsSmall(segment: Int) {
    check(
        name = "Return true If Any Segment Is Small",
        result = isSegmentSmall(segment),
        correct = true
    )
}

fun returnTrueIfIpHasMoreSegments(size: Int) {
    check(
        name = "Return True If Ip Has More Segments",
        result = isOverlimitSegmets(size),
        correct = true
    )
}

fun returnTrueIfIpHasLessSegments(size: Int) {
    check(
        name = "Return True If Ip Has Less Segments",
        result = isUnderlimitSegmets(size),
        correct = true
    )
}

fun returnFalseIfSegmentIsNotDigits(segment: String) {
    check(
        name = "Return False If Segment Is Not Digits",
        result = isValidSegmentFormat(segment),
        correct = false
    )
}

fun returnFalseIfIpDoesNotContainDot() {
    val ip = "19216811"
    check(
        name = "Return False If Ip Doesn't Contain Dot",
        result = containsDot(ip),
        correct = false
    )
}

fun returnTrueIfLeadingZero(ip: String) {
    check(
        name = "Return True If Any Segment Has Leading Zero",
        result = isLeadingZero(ip),
        correct = true
    )
}

fun returnTrueWhenIpIsValid(ip: String) {
    check(
        name = "Return True When Ip Is Valid",
        result = isValidIp(ip),
        correct = true
    )
}

fun returnFalseWhenIpIsInvalid(ip: String) {
    check(
        name = "Return False When Ip Is Invalid",
        result = isValidIp(ip),
        correct = false
    )
}

fun main() {

    println(isValidIp("192.168.1.1"))
    println(isValidIp("10.0.0.1"))
    println(isValidIp("172.16.254.1"))
    println(isValidIp("8.8.8.8"))
    println(isValidIp("1.1.1.1"))
    println(isValidIp("123.45.67.89"))
    println(isValidIp("255.255.255.255"))
    println(isValidIp("192.0.2.146"))
    println(isValidIp("198.51.100.42"))
    println(isValidIp("203.0.113.76"))

    println()

    println(isValidIp("256.100.50.25"))
    println(isValidIp("192.168.1.500"))
    println(isValidIp("10.0.0.-1"))
    println(isValidIp("172.16.254.01"))
    println(isValidIp("300.200.100.50"))
    println(isValidIp("192.168.1.1.1"))
    println(isValidIp("192.168.1"))
    println(isValidIp("abc.def.ghi.jkl"))
    println(isValidIp("192.168.1."))
    println(isValidIp("...1"))
}