// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class DatabaseUserSettingGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("acls")]
        private InputList<Inputs.DatabaseUserSettingAclGetArgs>? _acls;

        /// <summary>
        /// A set of ACLs (Access Control Lists) specifying permission on topics with a Kafka cluster. The properties of an individual ACL are described below:
        /// 
        /// An individual ACL includes the following:
        /// </summary>
        public InputList<Inputs.DatabaseUserSettingAclGetArgs> Acls
        {
            get => _acls ?? (_acls = new InputList<Inputs.DatabaseUserSettingAclGetArgs>());
            set => _acls = value;
        }

        public DatabaseUserSettingGetArgs()
        {
        }
        public static new DatabaseUserSettingGetArgs Empty => new DatabaseUserSettingGetArgs();
    }
}
