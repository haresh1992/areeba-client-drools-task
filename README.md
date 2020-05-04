
* To Test the Example :

1) GET API : http://localhost:8080/issueCard?type=prepaid

--> Request param :
- type : prepaid / credit

--> Response Body :
{
    "type": "prepaid",
    "limits": 999,
    "fees": null,
    "cardUsage": null,
    "loadingLimits": "Weekly"
}

--> When param type is credit :

GET URL : http://localhost:8080/issueCard?type=credit

--> Response Body :
{
    "type": "credit",
    "limits": 5000,
    "fees": 500,
    "cardUsage": 10,
    "loadingLimits": "Monthly"
}
