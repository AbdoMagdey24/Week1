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

fun returnTrueIfIpHasCharsOtherThanDots(ip: String) {
    check(
        name = "Return True If Ip Has Chars Other Than Dots",
        result = containsCharsOtherDot(ip),
        correct = true
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
    returnTrueIfAnySegmentIsBig(256)

    returnTrueIfAnySegmentIsSmall(-1)

    returnTrueIfIpHasMoreSegments(5)

    returnTrueIfIpHasLessSegments(3)

    returnTrueIfIpHasCharsOtherThanDots("192.168.one.1")

    returnFalseIfIpDoesNotContainDot()

    returnTrueIfLeadingZero("01")

    returnTrueWhenIpIsValid("192.168.1.1")
    returnTrueWhenIpIsValid("8.8.8.8")
    returnTrueWhenIpIsValid("1.2.3.4")
    returnTrueWhenIpIsValid("172.16.254.1")

    returnFalseWhenIpIsInvalid("256.100.50.25")
    returnFalseWhenIpIsInvalid("192.168.01.1")
    returnFalseWhenIpIsInvalid("192.168.1")
    returnFalseWhenIpIsInvalid("192.168.1.1.1")
    returnFalseWhenIpIsInvalid("192,168,1,1")
}