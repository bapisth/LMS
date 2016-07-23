ALTER TABLE booking CHANGE status status enum('Request','Request Accepted','Received','Process','Ready To Delivery','Delivered') NOT NULL DEFAULT 'Request';


ALTER TABLE booking MODIFY COLUMN pickuptime1 DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP;
ALTER TABLE booking MODIFY COLUMN pickuptime2 DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP;
ALTER TABLE booking MODIFY COLUMN delivertime1 DATETIME NULL;
ALTER TABLE booking MODIFY COLUMN delivertime2 DATETIME NULL;