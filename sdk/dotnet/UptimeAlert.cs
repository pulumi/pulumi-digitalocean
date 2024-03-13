// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    /// <summary>
    /// Provides a [DigitalOcean Uptime Alerts](https://docs.digitalocean.com/reference/api/api-reference/#operation/uptime_alert_create)
    /// resource. Uptime Alerts provide the ability to add alerts to your [DigitalOcean Uptime Checks](https://docs.digitalocean.com/reference/api/api-reference/#tag/Uptime) when your endpoints are slow, unavailable, or SSL certificates are expiring.
    /// 
    /// ## Import
    /// 
    /// Uptime alerts can be imported using both the ID of the alert's parent check and
    /// 
    /// its own separated by a comma in the format: `check_id,alert_id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import digitalocean:index/uptimeAlert:UptimeAlert target 94a7d216-d821-11ee-a327-33d3239ffc4b,5a4981aa-9653-4bd1-bef5-d6bff52042e4
    /// ```
    /// </summary>
    [DigitalOceanResourceType("digitalocean:index/uptimeAlert:UptimeAlert")]
    public partial class UptimeAlert : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A unique identifier for a check
        /// </summary>
        [Output("checkId")]
        public Output<string> CheckId { get; private set; } = null!;

        /// <summary>
        /// The comparison operator used against the alert's threshold. Must be one of `greater_than` or `less_than`.
        /// </summary>
        [Output("comparison")]
        public Output<string?> Comparison { get; private set; } = null!;

        /// <summary>
        /// A human-friendly display name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The notification settings for a trigger alert.
        /// </summary>
        [Output("notifications")]
        public Output<ImmutableArray<Outputs.UptimeAlertNotification>> Notifications { get; private set; } = null!;

        /// <summary>
        /// Period of time the threshold must be exceeded to trigger the alert. Must be one of `2m`, `3m`, `5m`, `10m`, `15m`, `30m` or `1h`.
        /// </summary>
        [Output("period")]
        public Output<string?> Period { get; private set; } = null!;

        /// <summary>
        /// The threshold at which the alert will enter a trigger state. The specific threshold is dependent on the alert type.
        /// </summary>
        [Output("threshold")]
        public Output<int?> Threshold { get; private set; } = null!;

        /// <summary>
        /// The type of health check to perform. Must be one of `latency`, `down`, `down_global` or `ssl_expiry`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a UptimeAlert resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UptimeAlert(string name, UptimeAlertArgs args, CustomResourceOptions? options = null)
            : base("digitalocean:index/uptimeAlert:UptimeAlert", name, args ?? new UptimeAlertArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UptimeAlert(string name, Input<string> id, UptimeAlertState? state = null, CustomResourceOptions? options = null)
            : base("digitalocean:index/uptimeAlert:UptimeAlert", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing UptimeAlert resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UptimeAlert Get(string name, Input<string> id, UptimeAlertState? state = null, CustomResourceOptions? options = null)
        {
            return new UptimeAlert(name, id, state, options);
        }
    }

    public sealed class UptimeAlertArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A unique identifier for a check
        /// </summary>
        [Input("checkId", required: true)]
        public Input<string> CheckId { get; set; } = null!;

        /// <summary>
        /// The comparison operator used against the alert's threshold. Must be one of `greater_than` or `less_than`.
        /// </summary>
        [Input("comparison")]
        public Input<string>? Comparison { get; set; }

        /// <summary>
        /// A human-friendly display name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notifications", required: true)]
        private InputList<Inputs.UptimeAlertNotificationArgs>? _notifications;

        /// <summary>
        /// The notification settings for a trigger alert.
        /// </summary>
        public InputList<Inputs.UptimeAlertNotificationArgs> Notifications
        {
            get => _notifications ?? (_notifications = new InputList<Inputs.UptimeAlertNotificationArgs>());
            set => _notifications = value;
        }

        /// <summary>
        /// Period of time the threshold must be exceeded to trigger the alert. Must be one of `2m`, `3m`, `5m`, `10m`, `15m`, `30m` or `1h`.
        /// </summary>
        [Input("period")]
        public Input<string>? Period { get; set; }

        /// <summary>
        /// The threshold at which the alert will enter a trigger state. The specific threshold is dependent on the alert type.
        /// </summary>
        [Input("threshold")]
        public Input<int>? Threshold { get; set; }

        /// <summary>
        /// The type of health check to perform. Must be one of `latency`, `down`, `down_global` or `ssl_expiry`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public UptimeAlertArgs()
        {
        }
        public static new UptimeAlertArgs Empty => new UptimeAlertArgs();
    }

    public sealed class UptimeAlertState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A unique identifier for a check
        /// </summary>
        [Input("checkId")]
        public Input<string>? CheckId { get; set; }

        /// <summary>
        /// The comparison operator used against the alert's threshold. Must be one of `greater_than` or `less_than`.
        /// </summary>
        [Input("comparison")]
        public Input<string>? Comparison { get; set; }

        /// <summary>
        /// A human-friendly display name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notifications")]
        private InputList<Inputs.UptimeAlertNotificationGetArgs>? _notifications;

        /// <summary>
        /// The notification settings for a trigger alert.
        /// </summary>
        public InputList<Inputs.UptimeAlertNotificationGetArgs> Notifications
        {
            get => _notifications ?? (_notifications = new InputList<Inputs.UptimeAlertNotificationGetArgs>());
            set => _notifications = value;
        }

        /// <summary>
        /// Period of time the threshold must be exceeded to trigger the alert. Must be one of `2m`, `3m`, `5m`, `10m`, `15m`, `30m` or `1h`.
        /// </summary>
        [Input("period")]
        public Input<string>? Period { get; set; }

        /// <summary>
        /// The threshold at which the alert will enter a trigger state. The specific threshold is dependent on the alert type.
        /// </summary>
        [Input("threshold")]
        public Input<int>? Threshold { get; set; }

        /// <summary>
        /// The type of health check to perform. Must be one of `latency`, `down`, `down_global` or `ssl_expiry`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public UptimeAlertState()
        {
        }
        public static new UptimeAlertState Empty => new UptimeAlertState();
    }
}
